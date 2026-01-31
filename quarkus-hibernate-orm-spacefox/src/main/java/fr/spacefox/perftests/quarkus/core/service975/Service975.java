package fr.spacefox.perftests.quarkus.core.service975;

import fr.spacefox.perftests.quarkus.core.port.data.Entity975DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service975.model.Model975;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service975 {

    private final Entity975DatasourcePort datasource;

    public Service975(Entity975DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model975 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
