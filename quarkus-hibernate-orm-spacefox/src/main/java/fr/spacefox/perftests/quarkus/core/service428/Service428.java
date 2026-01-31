package fr.spacefox.perftests.quarkus.core.service428;

import fr.spacefox.perftests.quarkus.core.port.data.Entity428DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service428.model.Model428;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service428 {

    private final Entity428DatasourcePort datasource;

    public Service428(Entity428DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model428 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
