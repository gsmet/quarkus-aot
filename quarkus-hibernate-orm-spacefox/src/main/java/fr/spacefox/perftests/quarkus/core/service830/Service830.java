package fr.spacefox.perftests.quarkus.core.service830;

import fr.spacefox.perftests.quarkus.core.port.data.Entity830DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service830.model.Model830;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service830 {

    private final Entity830DatasourcePort datasource;

    public Service830(Entity830DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model830 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
