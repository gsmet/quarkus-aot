package fr.spacefox.perftests.quarkus.core.service191;

import fr.spacefox.perftests.quarkus.core.port.data.Entity191DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service191.model.Model191;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service191 {

    private final Entity191DatasourcePort datasource;

    public Service191(Entity191DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model191 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
