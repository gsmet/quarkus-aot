package fr.spacefox.perftests.quarkus.core.service621;

import fr.spacefox.perftests.quarkus.core.port.data.Entity621DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service621.model.Model621;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service621 {

    private final Entity621DatasourcePort datasource;

    public Service621(Entity621DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model621 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
