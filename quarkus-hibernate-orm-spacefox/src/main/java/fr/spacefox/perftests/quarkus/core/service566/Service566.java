package fr.spacefox.perftests.quarkus.core.service566;

import fr.spacefox.perftests.quarkus.core.port.data.Entity566DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service566.model.Model566;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service566 {

    private final Entity566DatasourcePort datasource;

    public Service566(Entity566DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model566 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
