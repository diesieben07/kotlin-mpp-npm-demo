Example for using Gradle Kotlin/JS project from pure JS project.

Whats included:
- Kotlin MPP `module` with JVM and JS shared code
- Kotlin/JVM `server` module
- React Application `app-react` that calls `commonFun` from `mpp` module

To start React Application:
- `cd app-react`
- `yarn start`

How it works:
- Kotlin/JS Gradle plugin:
    - builds all Kotlin/JS packages into `build/js/packages`
    - extracts all Gradle dependencies into `build/js/packages_imported`
- We have `package.json` in root project dir that list all workspaces from Gradle Kotlin/JS build and our `app-react` module
- `yarn` will link all this workspaces together, so our `app-react` will able to resolve `kotlin-mpp-npm-demo-mpp` and all its dependencies from Gradle Kotlin/JS build.

Issues:
- Kotlin/JS Gradle plugin will call yarn and it will also download all dependencies in `build/js/node_modules` that is not used in our case
- `.d.ts` files is not generated from Kotlin/JS modules and it is hard to use it from js/ts 

Todo:
- Add Gradle task that builds `app-react` from Gradle
