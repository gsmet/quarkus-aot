package fr.spacefox.perftests.quarkus.core.service547;

import fr.spacefox.perftests.quarkus.core.port.data.Entity547DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service547.model.Model547;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service547 {

    private final Entity547DatasourcePort datasource;

    public Service547(Entity547DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model547 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
