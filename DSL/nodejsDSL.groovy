job('Aplicacion Node.js DSL') {
    description('Aplicación Node JS DSL para el curso de Jenkins')
    scm {
        git('https://github.com/ivan-calzada/nodejsapp.git', 'master') { node ->
            node / gitConfigName('ivan-calzada')
            node / gitConfigEmail('carlosivancalzadab@gmail.com')
        }
    }
    triggers {
        scm('H/7 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell("npm install")
    }
    
}
