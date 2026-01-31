package fr.spacefox.perftests.quarkus.core.service232;

import fr.spacefox.perftests.quarkus.core.port.data.Entity232DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service232.model.Model232;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service232 {

    private final Entity232DatasourcePort datasource;

    public Service232(Entity232DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model232 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
