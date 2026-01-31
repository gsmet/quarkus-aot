package fr.spacefox.perftests.quarkus.core.service573;

import fr.spacefox.perftests.quarkus.core.port.data.Entity573DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service573.model.Model573;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service573 {

    private final Entity573DatasourcePort datasource;

    public Service573(Entity573DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model573 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
