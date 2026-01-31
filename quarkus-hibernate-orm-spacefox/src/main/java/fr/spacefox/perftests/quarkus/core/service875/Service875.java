package fr.spacefox.perftests.quarkus.core.service875;

import fr.spacefox.perftests.quarkus.core.port.data.Entity875DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service875.model.Model875;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service875 {

    private final Entity875DatasourcePort datasource;

    public Service875(Entity875DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model875 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
