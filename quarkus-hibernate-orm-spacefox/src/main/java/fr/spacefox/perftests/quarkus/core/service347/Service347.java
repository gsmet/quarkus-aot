package fr.spacefox.perftests.quarkus.core.service347;

import fr.spacefox.perftests.quarkus.core.port.data.Entity347DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service347.model.Model347;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service347 {

    private final Entity347DatasourcePort datasource;

    public Service347(Entity347DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model347 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
