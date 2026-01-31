package fr.spacefox.perftests.quarkus.core.service520;

import fr.spacefox.perftests.quarkus.core.port.data.Entity520DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service520.model.Model520;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service520 {

    private final Entity520DatasourcePort datasource;

    public Service520(Entity520DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model520 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
