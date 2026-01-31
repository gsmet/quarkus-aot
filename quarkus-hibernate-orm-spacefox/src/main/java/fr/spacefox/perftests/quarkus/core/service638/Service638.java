package fr.spacefox.perftests.quarkus.core.service638;

import fr.spacefox.perftests.quarkus.core.port.data.Entity638DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service638.model.Model638;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service638 {

    private final Entity638DatasourcePort datasource;

    public Service638(Entity638DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model638 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
