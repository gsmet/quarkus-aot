package fr.spacefox.perftests.quarkus.core.service769;

import fr.spacefox.perftests.quarkus.core.port.data.Entity769DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service769.model.Model769;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service769 {

    private final Entity769DatasourcePort datasource;

    public Service769(Entity769DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model769 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
