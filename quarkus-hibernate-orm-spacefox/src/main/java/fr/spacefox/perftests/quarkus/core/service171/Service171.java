package fr.spacefox.perftests.quarkus.core.service171;

import fr.spacefox.perftests.quarkus.core.port.data.Entity171DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service171.model.Model171;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service171 {

    private final Entity171DatasourcePort datasource;

    public Service171(Entity171DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model171 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
