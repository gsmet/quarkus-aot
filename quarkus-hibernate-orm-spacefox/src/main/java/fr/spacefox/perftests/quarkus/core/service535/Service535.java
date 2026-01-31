package fr.spacefox.perftests.quarkus.core.service535;

import fr.spacefox.perftests.quarkus.core.port.data.Entity535DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service535.model.Model535;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service535 {

    private final Entity535DatasourcePort datasource;

    public Service535(Entity535DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model535 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
