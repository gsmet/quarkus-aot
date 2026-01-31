package fr.spacefox.perftests.quarkus.core.service761;

import fr.spacefox.perftests.quarkus.core.port.data.Entity761DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service761.model.Model761;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service761 {

    private final Entity761DatasourcePort datasource;

    public Service761(Entity761DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model761 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
