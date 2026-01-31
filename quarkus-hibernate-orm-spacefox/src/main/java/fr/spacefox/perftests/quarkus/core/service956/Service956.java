package fr.spacefox.perftests.quarkus.core.service956;

import fr.spacefox.perftests.quarkus.core.port.data.Entity956DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service956.model.Model956;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service956 {

    private final Entity956DatasourcePort datasource;

    public Service956(Entity956DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model956 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
