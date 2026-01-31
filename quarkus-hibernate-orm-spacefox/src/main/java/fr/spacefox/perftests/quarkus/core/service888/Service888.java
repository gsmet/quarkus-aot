package fr.spacefox.perftests.quarkus.core.service888;

import fr.spacefox.perftests.quarkus.core.port.data.Entity888DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service888.model.Model888;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service888 {

    private final Entity888DatasourcePort datasource;

    public Service888(Entity888DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model888 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
