package fr.spacefox.perftests.quarkus.core.service37;

import fr.spacefox.perftests.quarkus.core.port.data.Entity37DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service37.model.Model37;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service37 {

    private final Entity37DatasourcePort datasource;

    public Service37(Entity37DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model37 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
