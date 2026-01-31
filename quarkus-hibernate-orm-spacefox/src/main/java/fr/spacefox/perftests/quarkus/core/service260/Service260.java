package fr.spacefox.perftests.quarkus.core.service260;

import fr.spacefox.perftests.quarkus.core.port.data.Entity260DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service260.model.Model260;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service260 {

    private final Entity260DatasourcePort datasource;

    public Service260(Entity260DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model260 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
