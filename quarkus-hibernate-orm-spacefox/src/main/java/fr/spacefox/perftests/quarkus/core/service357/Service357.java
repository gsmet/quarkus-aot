package fr.spacefox.perftests.quarkus.core.service357;

import fr.spacefox.perftests.quarkus.core.port.data.Entity357DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service357.model.Model357;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service357 {

    private final Entity357DatasourcePort datasource;

    public Service357(Entity357DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model357 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
