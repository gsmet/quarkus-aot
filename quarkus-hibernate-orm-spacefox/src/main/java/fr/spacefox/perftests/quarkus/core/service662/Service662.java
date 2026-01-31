package fr.spacefox.perftests.quarkus.core.service662;

import fr.spacefox.perftests.quarkus.core.port.data.Entity662DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service662.model.Model662;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service662 {

    private final Entity662DatasourcePort datasource;

    public Service662(Entity662DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model662 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
