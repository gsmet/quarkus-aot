package fr.spacefox.perftests.quarkus.core.service33;

import fr.spacefox.perftests.quarkus.core.port.data.Entity33DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service33.model.Model33;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service33 {

    private final Entity33DatasourcePort datasource;

    public Service33(Entity33DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model33 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
