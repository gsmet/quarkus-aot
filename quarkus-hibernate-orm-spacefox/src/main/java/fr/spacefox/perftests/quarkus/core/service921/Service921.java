package fr.spacefox.perftests.quarkus.core.service921;

import fr.spacefox.perftests.quarkus.core.port.data.Entity921DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service921.model.Model921;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service921 {

    private final Entity921DatasourcePort datasource;

    public Service921(Entity921DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model921 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
