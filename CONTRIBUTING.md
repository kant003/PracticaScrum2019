## Creamos y nos situamos en una nueva rama
```
git checkout -b UH4_T6
```


## editamos el fichero (code, eclipse, ...) y comiteamos

```
git status

git add .

git commit  //  i   esc   wq

git log --oneline

```


## Subimos la rama al repositorio remoto (push)
```
git push origin UH4_T6
```


## ir al repositorio remoto de github

code/branch



## Lanzar el pull request pulsando en **New pull request**


No le des a merge (será el adminisrador quien lo merguee)

El administrador mergeará el pull request

Podrás ver en tu rama que su estado ha pasado de open a merge



## Nos traemos los cambios a nuestro repositrio master

```
git checkout master

git pull origin master

git log --oneline

```



## Borramos la rama (en local como en remoto

```
git branch

git branch -d UH4_T6

git push origin --delete UH4_T6

git log --oneline    // historial limpio
```
