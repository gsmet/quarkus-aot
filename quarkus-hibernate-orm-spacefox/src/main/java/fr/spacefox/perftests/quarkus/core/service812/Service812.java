package fr.spacefox.perftests.quarkus.core.service812;

import fr.spacefox.perftests.quarkus.core.port.data.Entity812DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service812.model.Model812;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service812 {

    private final Entity812DatasourcePort datasource;

    public Service812(Entity812DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model812 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
