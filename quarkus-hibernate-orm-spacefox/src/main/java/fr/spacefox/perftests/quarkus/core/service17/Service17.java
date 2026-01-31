package fr.spacefox.perftests.quarkus.core.service17;

import fr.spacefox.perftests.quarkus.core.port.data.Entity17DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service17.model.Model17;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service17 {

    private final Entity17DatasourcePort datasource;

    public Service17(Entity17DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model17 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
