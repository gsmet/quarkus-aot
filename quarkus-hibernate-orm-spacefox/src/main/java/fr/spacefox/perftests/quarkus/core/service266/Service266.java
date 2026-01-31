package fr.spacefox.perftests.quarkus.core.service266;

import fr.spacefox.perftests.quarkus.core.port.data.Entity266DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service266.model.Model266;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service266 {

    private final Entity266DatasourcePort datasource;

    public Service266(Entity266DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model266 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
