package fr.spacefox.perftests.quarkus.core.service805;

import fr.spacefox.perftests.quarkus.core.port.data.Entity805DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service805.model.Model805;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service805 {

    private final Entity805DatasourcePort datasource;

    public Service805(Entity805DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model805 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
