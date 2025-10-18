def call(String format, String outputFile) {
    sh "trivy fs . -f ${format} -o ${outputFile}"
}