package fr.spacefox.perftests.quarkus.core.service66;

import fr.spacefox.perftests.quarkus.core.port.data.Entity66DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service66.model.Model66;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service66 {

    private final Entity66DatasourcePort datasource;

    public Service66(Entity66DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model66 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
