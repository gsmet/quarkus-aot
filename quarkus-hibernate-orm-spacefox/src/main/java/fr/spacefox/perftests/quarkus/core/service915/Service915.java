package fr.spacefox.perftests.quarkus.core.service915;

import fr.spacefox.perftests.quarkus.core.port.data.Entity915DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service915.model.Model915;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service915 {

    private final Entity915DatasourcePort datasource;

    public Service915(Entity915DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model915 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
