def call(String user_name, String project_name, String tag_name) {
    sh """
        docker build -t ${user_name}/${project_name}:${tag_name} .
    """
}