package fr.spacefox.perftests.quarkus.core.service943;

import fr.spacefox.perftests.quarkus.core.port.data.Entity943DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service943.model.Model943;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service943 {

    private final Entity943DatasourcePort datasource;

    public Service943(Entity943DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model943 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
