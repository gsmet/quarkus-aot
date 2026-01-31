package fr.spacefox.perftests.quarkus.core.service343;

import fr.spacefox.perftests.quarkus.core.port.data.Entity343DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service343.model.Model343;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service343 {

    private final Entity343DatasourcePort datasource;

    public Service343(Entity343DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model343 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
