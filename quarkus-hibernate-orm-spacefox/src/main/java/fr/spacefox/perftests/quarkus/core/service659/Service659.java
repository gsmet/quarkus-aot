package fr.spacefox.perftests.quarkus.core.service659;

import fr.spacefox.perftests.quarkus.core.port.data.Entity659DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service659.model.Model659;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service659 {

    private final Entity659DatasourcePort datasource;

    public Service659(Entity659DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model659 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
