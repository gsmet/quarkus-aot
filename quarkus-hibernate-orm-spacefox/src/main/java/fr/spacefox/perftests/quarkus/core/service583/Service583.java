package fr.spacefox.perftests.quarkus.core.service583;

import fr.spacefox.perftests.quarkus.core.port.data.Entity583DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service583.model.Model583;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service583 {

    private final Entity583DatasourcePort datasource;

    public Service583(Entity583DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model583 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
