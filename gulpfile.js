var gulp         = require('gulp');
var sass         = require('gulp-sass');
var sourcemaps   = require('gulp-sourcemaps');
var postcss      = require('gulp-postcss');
var autoprefixer = require('autoprefixer');
var pixrem = require('pixrem');
var cssnano = require('gulp-cssnano');
require('es6-promise').polyfill();

var targetBrowsers = '> 1%';


gulp.task('scss', function () {
    gulp.src('dev-resources/scss/style.scss')
        .pipe(sourcemaps.init())
        .pipe(sass({
            // includePaths: require('node-bourbon').with('other/path', 'another/path')
            // - or -
            includePaths: require('node-bourbon').includePaths
        }))
        .pipe(postcss([
            autoprefixer({browsers:[targetBrowsers]})
        ]))
        .pipe(sourcemaps.write())
        .pipe(gulp.dest('./resources/public/css'))
});

gulp.task('scss:prod', function () {
    gulp.src('dev-resources/scss/styles.scss')
        .pipe(sourcemaps.init())
        .pipe(sass({
            // includePaths: require('node-bourbon').with('other/path', 'another/path')
            // - or -
            includePaths: require('node-bourbon').includePaths
        }))
        .pipe(postcss([
            autoprefixer({browsers:[targetBrowsers]}),
        ]))
        .pipe(cssnano({safe: true, options: {safe: true}})) // which is it?!
        .pipe(sourcemaps.write())
        .pipe(gulp.dest('./resources/public/css'))
});

gulp.task('scss:watch', ['scss'], function () {
    gulp.watch(['./dev-resources/scss/**/*.scss', './checkouts/style.com-shared/resources/scss/**/*.scss'], ['scss'])
});

gulp.task('default', ['scss:watch']);
