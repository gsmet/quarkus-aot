package fr.spacefox.perftests.quarkus.core.service406;

import fr.spacefox.perftests.quarkus.core.port.data.Entity406DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service406.model.Model406;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service406 {

    private final Entity406DatasourcePort datasource;

    public Service406(Entity406DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model406 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
