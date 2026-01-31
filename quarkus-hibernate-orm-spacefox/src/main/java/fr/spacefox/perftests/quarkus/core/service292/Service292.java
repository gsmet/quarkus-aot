package fr.spacefox.perftests.quarkus.core.service292;

import fr.spacefox.perftests.quarkus.core.port.data.Entity292DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service292.model.Model292;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service292 {

    private final Entity292DatasourcePort datasource;

    public Service292(Entity292DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model292 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
