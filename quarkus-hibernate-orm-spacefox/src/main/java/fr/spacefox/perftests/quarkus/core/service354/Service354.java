package fr.spacefox.perftests.quarkus.core.service354;

import fr.spacefox.perftests.quarkus.core.port.data.Entity354DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service354.model.Model354;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service354 {

    private final Entity354DatasourcePort datasource;

    public Service354(Entity354DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model354 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
