package blue.roygbiv.nafap

import java.util.concurrent.ThreadLocalRandom

//This is currently first pass at small side project without runtime configuration. Letting compiler find configuration issues
// instead of persisting configuration in file or database.
class ConfiguredNoteCards {
    private var index = -1
    val noteCards : List<NoteCard> = listOf(
        NoteCard("Amazon Athena", "Analyze S3 data with SQL. Integrates with AWS Glue", Category.Analytics),
        NoteCard("Amazon EMR", "Hadoop based. Has Jupyter like notebooks for ad hoc querying", Category.Analytics),
        NoteCard("Amazon CloudSearch", "Common search functionality. Supports 34 languages, highlighting, autocomplete and geospatial search", Category.Analytics),
        NoteCard("Amazon Elasticsearch Service", "log, text analytics and visualization capabilities of ElasticSearch in AWS. Can integrate with Logstash and Kibana", Category.Analytics),
        NoteCard("Amazon Kinesis", "contains 4 services for collecting, processing and analyzing streams real-time", Category.Analytics),
        NoteCard("Amazon Kinesis Data Firehose", "used to transform and load stream data into datastores or to analytics tools", Category.Analytics),
        NoteCard("Amazon Kinesis Data Analytics", "analyze streaming data", Category.Analytics),
        NoteCard("Amazon Kinesis Data Streams", "stream data real-time for analytics", Category.Analytics),
        NoteCard("Amazon  Kinesis Video Streams", "stream video to AWS for analytics", Category.Analytics),
        NoteCard("Amazon Redshift", "columnar storage highly scalable data warehouse with massively parallel querying", Category.Analytics),
        NoteCard("Amazon QuickSight", "business intelligence service for creating interactive dashboards", Category.Analytics),
        NoteCard("AWS Data Pipeline ", "fault tolerant implementation to move and transform data between compute, storage and on-premise data storage", Category.Analytics),
        NoteCard("AWS Glue", "extra, transform and load service that can discover and store metadata in AWS Glue Data Catalog for search/query", Category.Analytics),
        NoteCard("AWS Lake Formation", "Secure and manage data lakes. Moves data to S3, cleans and secures data and builds centralized data catalog", Category.Analytics),
        NoteCard("Amazon Managed Streaming for Kafka (MSK)", "helps with applications that do real time streaming of data pipelines with Apache Kafka clusters", Category.Analytics),
        NoteCard("AWS Step Functions", "build serverless workflows for example with Lambda and ECS, allows tracking of execution of workflow", Category.ApplicationIntegration),
        NoteCard("Amazon MQ", "message broker service based on ActiveMQ, supports JMS, NMS, AMQP, STOMP, MQTT, and WebSocket", Category.ApplicationIntegration),
        NoteCard("Amazon SQS", "(simple queue service) Message queuing service for decoupling between serverless, microservice and distributed systems. Some options include max throughput or guaranteed one time in order delivery options.", Category.ApplicationIntegration),
        NoteCard("Amazon SNS", "(simple notification service) pub/sub messaging has options such as push-based, many-to-many messages or send messages to multiple subscribers for parallel computing", Category.ApplicationIntegration),
        NoteCard("Amazon SWF", "(simple workflow) Task coordinator allows retries of failures, requires tracking state for processes running more than 500 milliseconds. Runs parallel and sequential background jobs.", Category.ApplicationIntegration),
        NoteCard("Amazon Sumerian","VR, AR and 3D applications",Category.ARAndVR),
        NoteCard("AWS Cost Explorer","visualization tool to help manage your AWS costs",Category.AWSCostManagement),
        NoteCard("AWS Budgets","track and notify about budget status",Category.AWSCostManagement),
        NoteCard("AWS Cost & Usage Report","used to investigate hourly and daily usage to understand costs",Category.AWSCostManagement),
        NoteCard("Reserved Instance (RI) Reporting","in the AWS Cost Explorer, provides aggregated reporting data about reserved instances",Category.AWSCostManagement),
        NoteCard("Amazon Managed Blockchain","manage blockchain networks",Category.Blockchain),
        NoteCard("Alexa for Business","utilize Alexa for work setting",Category.BusinessApplications),
        NoteCard("Amazon WorkDocs","share files, comment on files, integrate with corporate directories",Category.BusinessApplications)
    )

    fun getNextNoteCard() : NoteCard {
        updateIndex()
        return noteCards[index]
    }

    private fun updateIndex(){
        index += 1
        if(index > (noteCards.size - 1 )){
            index = 0
        }
    }
}