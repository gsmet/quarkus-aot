package fr.spacefox.perftests.quarkus.core.service716;

import fr.spacefox.perftests.quarkus.core.port.data.Entity716DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service716.model.Model716;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service716 {

    private final Entity716DatasourcePort datasource;

    public Service716(Entity716DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model716 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
