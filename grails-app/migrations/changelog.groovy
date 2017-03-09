databaseChangeLog = {

    changeSet(author: "robert.sanders (generated)", id: "1489092212951-1") {
        createTable(tableName: "author") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "authorPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "birth_day", type: "timestamp") {
                constraints(nullable: "false")
            }

            column(name: "first_name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "last_name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "robert.sanders (generated)", id: "1489092212951-2") {
        createTable(tableName: "author_publications") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "author_publicationsPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "author_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "publication_id", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "robert.sanders (generated)", id: "1489092212951-3") {
        createTable(tableName: "publication") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "publicationPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "first_edition", type: "timestamp") {
                constraints(nullable: "false")
            }

            column(name: "title", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "robert.sanders (generated)", id: "1489092212951-4") {
        addForeignKeyConstraint(baseColumnNames: "author_id", baseTableName: "author_publications", constraintName: "FKeesipob2kuay3s4pbju9whhw2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "author")
    }

    changeSet(author: "robert.sanders (generated)", id: "1489092212951-5") {
        addForeignKeyConstraint(baseColumnNames: "publication_id", baseTableName: "author_publications", constraintName: "FKesqjsnyhk8mio5wbgkt6sw4yp", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "publication")
    }
    
    // New change, not initally present.
    changeSet(author: "robert.sanders (generated)", id: "1489092212951-8") {
        addColumn(tableName: "author") {
            column(name: "email", type: "VARCHAR(255)")
        }
    }
}
