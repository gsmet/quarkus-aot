package fr.spacefox.perftests.quarkus.core.service652;

import fr.spacefox.perftests.quarkus.core.port.data.Entity652DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service652.model.Model652;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service652 {

    private final Entity652DatasourcePort datasource;

    public Service652(Entity652DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model652 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
