package fr.spacefox.perftests.quarkus.core.service291;

import fr.spacefox.perftests.quarkus.core.port.data.Entity291DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service291.model.Model291;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service291 {

    private final Entity291DatasourcePort datasource;

    public Service291(Entity291DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model291 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
