package fr.spacefox.perftests.quarkus.core.service369;

import fr.spacefox.perftests.quarkus.core.port.data.Entity369DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service369.model.Model369;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service369 {

    private final Entity369DatasourcePort datasource;

    public Service369(Entity369DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model369 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
