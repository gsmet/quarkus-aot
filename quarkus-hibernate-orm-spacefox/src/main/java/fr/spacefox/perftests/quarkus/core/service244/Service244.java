package fr.spacefox.perftests.quarkus.core.service244;

import fr.spacefox.perftests.quarkus.core.port.data.Entity244DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service244.model.Model244;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service244 {

    private final Entity244DatasourcePort datasource;

    public Service244(Entity244DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model244 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
