package fr.spacefox.perftests.quarkus.core.service837;

import fr.spacefox.perftests.quarkus.core.port.data.Entity837DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service837.model.Model837;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service837 {

    private final Entity837DatasourcePort datasource;

    public Service837(Entity837DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model837 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
