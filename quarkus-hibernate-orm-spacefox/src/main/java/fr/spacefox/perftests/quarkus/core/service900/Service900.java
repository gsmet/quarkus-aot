package fr.spacefox.perftests.quarkus.core.service900;

import fr.spacefox.perftests.quarkus.core.port.data.Entity900DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service900.model.Model900;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service900 {

    private final Entity900DatasourcePort datasource;

    public Service900(Entity900DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model900 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
