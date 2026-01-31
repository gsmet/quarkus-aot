package fr.spacefox.perftests.quarkus.core.service897;

import fr.spacefox.perftests.quarkus.core.port.data.Entity897DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service897.model.Model897;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service897 {

    private final Entity897DatasourcePort datasource;

    public Service897(Entity897DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model897 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
